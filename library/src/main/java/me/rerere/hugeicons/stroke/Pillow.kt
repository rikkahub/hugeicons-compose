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

val HugeIcons.Pillow: ImageVector
    get() {
        if (_pillow != null) {
            return _pillow!!
        }
        _pillow = ImageVector.Builder(
            name = "Pillow",
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
            moveTo(17.5f, 15f)
            curveTo(17.7812f, 14.0181f, 18f, 12.949f, 18f, 12f)
            curveTo(18f, 11.051f, 17.7812f, 9.98194f, 17.5f, 9f)
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
            moveTo(2.53053f, 8.52444f)
            curveTo(2.27447f, 9.62668f, 2f, 10.6631f, 2f, 12f)
            curveTo(2f, 13.337f, 2.27447f, 14.3734f, 2.53053f, 15.4756f)
            curveTo(2.6102f, 15.8185f, 2.59124f, 16.1764f, 2.48266f, 16.5113f)
            lineTo(2.08419f, 17.7404f)
            curveTo(2.02841f, 17.9124f, 2f, 18.0921f, 2f, 18.273f)
            curveTo(2f, 19.2268f, 2.77322f, 20f, 3.72703f, 20f)
            curveTo(4.18123f, 20f, 4.71699f, 19.9147f, 5.13966f, 19.7484f)
            lineTo(5.79318f, 19.4914f)
            curveTo(6.22972f, 19.3196f, 6.71096f, 19.3124f, 7.16238f, 19.4399f)
            curveTo(8.34328f, 19.7737f, 9.74638f, 20f, 12.0001f, 20f)
            curveTo(14.2537f, 20f, 15.6567f, 19.7737f, 16.8376f, 19.4399f)
            curveTo(17.289f, 19.3124f, 17.7703f, 19.3196f, 18.2068f, 19.4914f)
            lineTo(18.8603f, 19.7484f)
            curveTo(19.283f, 19.9147f, 19.8188f, 20f, 20.273f, 20f)
            curveTo(21.2268f, 20f, 22f, 19.2268f, 22f, 18.273f)
            curveTo(22f, 18.0921f, 21.9716f, 17.9124f, 21.9158f, 17.7404f)
            lineTo(21.5173f, 16.5113f)
            curveTo(21.4088f, 16.1764f, 21.3898f, 15.8185f, 21.4695f, 15.4756f)
            curveTo(21.7255f, 14.3734f, 22f, 13.337f, 22f, 12f)
            curveTo(22f, 10.6631f, 21.7255f, 9.62668f, 21.4695f, 8.52444f)
            curveTo(21.3898f, 8.1815f, 21.4088f, 7.82363f, 21.5173f, 7.48871f)
            lineTo(21.9158f, 6.25966f)
            curveTo(21.9716f, 6.08762f, 22f, 5.90789f, 22f, 5.72703f)
            curveTo(22f, 4.77322f, 21.2268f, 4f, 20.273f, 4f)
            curveTo(19.8188f, 4f, 19.283f, 4.08535f, 18.8603f, 4.25161f)
            lineTo(18.2068f, 4.50868f)
            curveTo(17.7703f, 4.68039f, 17.289f, 4.68767f, 16.8376f, 4.5601f)
            curveTo(15.6567f, 4.22636f, 14.2537f, 4f, 12.0001f, 4f)
            curveTo(9.74638f, 4f, 8.34328f, 4.22636f, 7.16238f, 4.5601f)
            curveTo(6.71096f, 4.68767f, 6.22972f, 4.68039f, 5.79318f, 4.50868f)
            lineTo(5.13966f, 4.25161f)
            curveTo(4.71699f, 4.08535f, 4.18123f, 4f, 3.72703f, 4f)
            curveTo(2.77322f, 4f, 2f, 4.77322f, 2f, 5.72703f)
            curveTo(2f, 5.90789f, 2.02841f, 6.08762f, 2.08419f, 6.25966f)
            lineTo(2.48266f, 7.48871f)
            curveTo(2.59124f, 7.82363f, 2.6102f, 8.1815f, 2.53053f, 8.52444f)
            close()
        }
        }.build()

        return _pillow!!
    }

private var _pillow: ImageVector? = null
