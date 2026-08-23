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

val HugeIcons.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = ImageVector.Builder(
            name = "Tent",
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
            moveTo(10.2112f, 16.4234f)
            lineTo(8.00003f, 21f)
            lineTo(16f, 21f)
            lineTo(13.7889f, 16.4234f)
            curveTo(13.0083f, 14.8078f, 12.6181f, 14f, 12f, 14f)
            curveTo(11.382f, 14f, 10.9917f, 14.8078f, 10.2112f, 16.4234f)
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
            moveTo(9.99997f, 3f)
            lineTo(19.2905f, 14.8243f)
            curveTo(20.1372f, 15.9019f, 20.5605f, 16.4407f, 20.7803f, 17.076f)
            curveTo(21f, 17.7113f, 21f, 18.3965f, 21f, 19.7669f)
            verticalLineTo(21f)
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
            moveTo(14f, 3f)
            lineTo(4.70943f, 14.8244f)
            curveTo(3.86277f, 15.902f, 3.43945f, 16.4407f, 3.21973f, 17.076f)
            curveTo(3.00002f, 17.7112f, 3.00001f, 18.3964f, 2.99999f, 19.7668f)
            lineTo(2.99997f, 21f)
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
            moveTo(2f, 21f)
            horizontalLineTo(22f)
        }
        }.build()

        return _tent!!
    }

private var _tent: ImageVector? = null
