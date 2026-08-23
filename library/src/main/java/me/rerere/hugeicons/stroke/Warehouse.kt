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

val HugeIcons.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = ImageVector.Builder(
            name = "Warehouse",
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
            moveTo(7f, 22f)
            verticalLineTo(14f)
            curveTo(7f, 12.1144f, 7f, 11.1716f, 7.58579f, 10.5858f)
            curveTo(8.17157f, 10f, 9.11438f, 10f, 11f, 10f)
            horizontalLineTo(13f)
            curveTo(14.8856f, 10f, 15.8284f, 10f, 16.4142f, 10.5858f)
            curveTo(17f, 11.1716f, 17f, 12.1144f, 17f, 14f)
            verticalLineTo(22f)
            horizontalLineTo(7f)
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
            moveTo(7f, 14f)
            horizontalLineTo(17f)
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
            moveTo(7f, 18f)
            horizontalLineTo(17f)
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
            moveTo(18.1287f, 5.23204f)
            lineTo(15.1287f, 3.39725f)
            curveTo(13.6056f, 2.46575f, 12.8441f, 2f, 12f, 2f)
            curveTo(11.1559f, 2f, 10.3944f, 2.46575f, 8.8713f, 3.39725f)
            lineTo(5.8713f, 5.23204f)
            curveTo(4.46832f, 6.0901f, 3.76683f, 6.51912f, 3.38341f, 7.20331f)
            curveTo(3f, 7.8875f, 3f, 8.71027f, 3f, 10.3558f)
            verticalLineTo(15.9952f)
            curveTo(3f, 18.8259f, 3f, 20.2412f, 3.87868f, 21.1206f)
            curveTo(4.75736f, 22f, 6.17157f, 22f, 9f, 22f)
            horizontalLineTo(15f)
            curveTo(17.8284f, 22f, 19.2426f, 22f, 20.1213f, 21.1206f)
            curveTo(21f, 20.2412f, 21f, 18.8259f, 21f, 15.9952f)
            verticalLineTo(10.3558f)
            curveTo(21f, 8.71027f, 21f, 7.8875f, 20.6166f, 7.20331f)
            curveTo(20.2332f, 6.51912f, 19.5317f, 6.0901f, 18.1287f, 5.23204f)
            close()
        }
        }.build()

        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
