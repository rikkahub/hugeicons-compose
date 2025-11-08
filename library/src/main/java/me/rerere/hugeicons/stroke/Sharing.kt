package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sharing: ImageVector
    get() {
        if (_sharing != null) {
            return _sharing!!
        }
        _sharing = ImageVector.Builder(
            name = "Sharing",
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
        moveTo(15f, 16f)
        curveTo(15f, 17.6569f, 13.6569f, 19f, 12f, 19f)
        curveTo(10.3431f, 19f, 9f, 17.6569f, 9f, 16f)
        curveTo(9f, 14.3431f, 10.3431f, 13f, 12f, 13f)
        curveTo(13.6569f, 13f, 15f, 14.3431f, 15f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 5f)
        horizontalLineTo(19.9994f)
        curveTo(20.9422f, 5f, 21.4136f, 5f, 21.7065f, 5.29289f)
        curveTo(21.9994f, 5.58579f, 21.9994f, 6.05719f, 21.9994f, 7f)
        verticalLineTo(9.5f)
        moveTo(16f, 11f)
        lineTo(21.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.49942f, 5f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 5f, 2.58579f, 5f, 2.29289f, 5.29289f)
        curveTo(2f, 5.58579f, 2f, 6.05719f, 2f, 7f)
        verticalLineTo(9.5f)
        moveTo(8f, 11.0006f)
        lineTo(2.49942f, 5.5f)
        }
        }.build()

        return _sharing!!
    }

private var _sharing: ImageVector? = null
