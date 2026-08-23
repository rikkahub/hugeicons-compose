package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SunMedium: ImageVector
    get() {
        if (_sunMedium != null) {
            return _sunMedium!!
        }
        _sunMedium = ImageVector.Builder(
            name = "SunMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 12f)
            curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
            curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
            curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
            curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9982f, 2f)
            verticalLineTo(4f)
            moveTo(11.9982f, 20f)
            verticalLineTo(22f)
            moveTo(18.9981f, 5.00098f)
            lineTo(17.499f, 6.5f)
            moveTo(6.5f, 17.5f)
            lineTo(5f, 19f)
            moveTo(22f, 12f)
            horizontalLineTo(20f)
            moveTo(4f, 12f)
            horizontalLineTo(2f)
            moveTo(19f, 19.001f)
            lineTo(17.5f, 17.501f)
            moveTo(6.49902f, 6.5f)
            lineTo(5f, 5.00098f)
        }
        }.build()

        return _sunMedium!!
    }

private var _sunMedium: ImageVector? = null
