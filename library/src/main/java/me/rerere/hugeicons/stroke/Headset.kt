package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = ImageVector.Builder(
            name = "Headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 10.8954f, 15.8954f, 10f, 17f, 10f)
        curveTo(19.2091f, 10f, 21f, 11.7909f, 21f, 14f)
        curveTo(21f, 16.2091f, 19.2091f, 18f, 17f, 18f)
        curveTo(15.8954f, 18f, 15f, 17.1046f, 15f, 16f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        curveTo(9f, 10.8954f, 8.10457f, 10f, 7f, 10f)
        curveTo(4.79086f, 10f, 3f, 11.7909f, 3f, 14f)
        curveTo(3f, 16.2091f, 4.79086f, 18f, 7f, 18f)
        curveTo(8.10457f, 18f, 9f, 17.1046f, 9f, 16f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        verticalLineTo(11f)
        curveTo(3f, 6.02944f, 7.02944f, 2f, 12f, 2f)
        curveTo(16.9706f, 2f, 21f, 6.02944f, 21f, 11f)
        verticalLineTo(15.8462f)
        curveTo(21f, 17.8545f, 21f, 18.8586f, 20.6476f, 19.6417f)
        curveTo(20.2465f, 20.5329f, 19.5329f, 21.2465f, 18.6417f, 21.6476f)
        curveTo(17.8586f, 22f, 16.8545f, 22f, 14.8462f, 22f)
        horizontalLineTo(12f)
        }
        }.build()

        return _headset!!
    }

private var _headset: ImageVector? = null
