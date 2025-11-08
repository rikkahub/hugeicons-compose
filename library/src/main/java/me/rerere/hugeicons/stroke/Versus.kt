package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Versus: ImageVector
    get() {
        if (_versus != null) {
            return _versus!!
        }
        _versus = ImageVector.Builder(
            name = "Versus",
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
        moveTo(16f, 4f)
        lineTo(6f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 4f)
        lineTo(7f, 12f)
        lineTo(11f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13.5f)
        verticalLineTo(13f)
        curveTo(19f, 12.4477f, 18.5523f, 12f, 18f, 12f)
        horizontalLineTo(15f)
        curveTo(14.4477f, 12f, 14f, 12.4477f, 14f, 13f)
        verticalLineTo(15f)
        curveTo(14f, 15.5523f, 14.4477f, 16f, 15f, 16f)
        horizontalLineTo(18f)
        curveTo(18.5523f, 16f, 19f, 16.4477f, 19f, 17f)
        verticalLineTo(19f)
        curveTo(19f, 19.5523f, 18.5523f, 20f, 18f, 20f)
        horizontalLineTo(15f)
        curveTo(14.4477f, 20f, 14f, 19.5523f, 14f, 19f)
        verticalLineTo(18.5f)
        }
        }.build()

        return _versus!!
    }

private var _versus: ImageVector? = null
