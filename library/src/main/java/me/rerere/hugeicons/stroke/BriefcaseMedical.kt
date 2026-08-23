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

val HugeIcons.BriefcaseMedical: ImageVector
    get() {
        if (_briefcaseMedical != null) {
            return _briefcaseMedical!!
        }
        _briefcaseMedical = ImageVector.Builder(
            name = "BriefcaseMedical",
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
            moveTo(8.5f, 7f)
            verticalLineTo(6.5f)
            curveTo(8.5f, 5.09554f, 8.5f, 4.39331f, 8.83706f, 3.88886f)
            curveTo(8.98298f, 3.67048f, 9.17048f, 3.48298f, 9.38886f, 3.33706f)
            curveTo(9.89331f, 3f, 10.5955f, 3f, 12f, 3f)
            curveTo(13.4045f, 3f, 14.1067f, 3f, 14.6111f, 3.33706f)
            curveTo(14.8295f, 3.48298f, 15.017f, 3.67048f, 15.1629f, 3.88886f)
            curveTo(15.5f, 4.39331f, 15.5f, 5.09554f, 15.5f, 6.5f)
            verticalLineTo(7f)
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
            moveTo(2f, 13f)
            verticalLineTo(15f)
            curveTo(2f, 17.8284f, 2f, 19.2426f, 2.87868f, 20.1213f)
            curveTo(3.75736f, 21f, 5.17157f, 21f, 8f, 21f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 21f, 20.2426f, 21f, 21.1213f, 20.1213f)
            curveTo(22f, 19.2426f, 22f, 17.8284f, 22f, 15f)
            verticalLineTo(13f)
            curveTo(22f, 10.1716f, 22f, 8.75734f, 21.1213f, 7.87866f)
            curveTo(20.2426f, 6.99998f, 18.8284f, 6.99999f, 16f, 7f)
            lineTo(7.99997f, 7.00004f)
            curveTo(5.17155f, 7.00006f, 3.75735f, 7.00007f, 2.87867f, 7.87874f)
            curveTo(2f, 8.75742f, 2f, 10.1716f, 2f, 13f)
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
            moveTo(11.9925f, 11f)
            verticalLineTo(17f)
            moveTo(15f, 13.9925f)
            lineTo(9f, 13.9925f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 7f)
            verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 7f)
            verticalLineTo(21f)
        }
        }.build()

        return _briefcaseMedical!!
    }

private var _briefcaseMedical: ImageVector? = null
