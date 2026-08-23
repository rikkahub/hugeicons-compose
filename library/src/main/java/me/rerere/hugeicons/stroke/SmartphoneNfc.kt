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

val HugeIcons.SmartphoneNfc: ImageVector
    get() {
        if (_smartphoneNfc != null) {
            return _smartphoneNfc!!
        }
        _smartphoneNfc = ImageVector.Builder(
            name = "SmartphoneNfc",
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
            moveTo(9f, 14.5f)
            verticalLineTo(9.5f)
            curveTo(9f, 8.09554f, 9f, 7.39331f, 8.66294f, 6.88886f)
            curveTo(8.51702f, 6.67048f, 8.32952f, 6.48298f, 8.11114f, 6.33706f)
            curveTo(7.60669f, 6f, 6.90446f, 6f, 5.5f, 6f)
            curveTo(4.09554f, 6f, 3.39331f, 6f, 2.88886f, 6.33706f)
            curveTo(2.67048f, 6.48298f, 2.48298f, 6.67048f, 2.33706f, 6.88886f)
            curveTo(2f, 7.39331f, 2f, 8.09554f, 2f, 9.5f)
            verticalLineTo(14.5f)
            curveTo(2f, 15.9045f, 2f, 16.6067f, 2.33706f, 17.1111f)
            curveTo(2.48298f, 17.3295f, 2.67048f, 17.517f, 2.88886f, 17.6629f)
            curveTo(3.39331f, 18f, 4.09554f, 18f, 5.5f, 18f)
            curveTo(6.90446f, 18f, 7.60669f, 18f, 8.11114f, 17.6629f)
            curveTo(8.32952f, 17.517f, 8.51702f, 17.3295f, 8.66294f, 17.1111f)
            curveTo(9f, 16.6067f, 9f, 15.9045f, 9f, 14.5f)
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
            moveTo(20f, 5f)
            curveTo(21.1956f, 6.39726f, 22f, 9.00885f, 22f, 12f)
            curveTo(22f, 14.9912f, 21.1956f, 17.6027f, 20f, 19f)
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
            moveTo(16.5f, 7f)
            curveTo(17.3967f, 7.99804f, 18f, 9.86346f, 18f, 12f)
            curveTo(18f, 14.1365f, 17.3967f, 16.002f, 16.5f, 17f)
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
            moveTo(13f, 9f)
            curveTo(13.5978f, 9.59883f, 14f, 10.7181f, 14f, 12f)
            curveTo(14f, 13.2819f, 13.5978f, 14.4012f, 13f, 15f)
        }
        }.build()

        return _smartphoneNfc!!
    }

private var _smartphoneNfc: ImageVector? = null
