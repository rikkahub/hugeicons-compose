package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Recycle01: ImageVector
    get() {
        if (_recycle01 != null) {
            return _recycle01!!
        }
        _recycle01 = ImageVector.Builder(
            name = "Recycle01",
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
        moveTo(17.9999f, 15.9988f)
        curveTo(16.4999f, 16.999f, 14.6842f, 18.9772f, 14f, 22f)
        moveTo(15f, 19.3372f)
        curveTo(12.6321f, 14.0106f, 17.4087f, 12.2141f, 21.0443f, 12.0143f)
        curveTo(21.4831f, 11.9902f, 21.7025f, 11.9782f, 21.86f, 12.1336f)
        curveTo(22.0176f, 12.289f, 22.0085f, 12.5106f, 21.9903f, 12.9536f)
        curveTo(21.8394f, 16.638f, 20.3286f, 21.707f, 15f, 19.3372f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 20f)
        horizontalLineTo(6.02099f)
        curveTo(3.73502f, 20f, 2.59203f, 20f, 2.15185f, 19.2655f)
        curveTo(1.71168f, 18.531f, 2.2625f, 17.5428f, 3.36416f, 15.5666f)
        lineTo(4.79185f, 13.0054f)
        curveTo(5.53109f, 11.6793f, 5.90071f, 11.0162f, 6.47924f, 11.0003f)
        curveTo(7.05776f, 10.9844f, 7.46426f, 11.6261f, 8.27725f, 12.9095f)
        lineTo(8.97855f, 14.0166f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8.03384f)
        lineTo(8.99165f, 6.15531f)
        curveTo(10.4526f, 3.38777f, 11.1831f, 2.004f, 12.2929f, 2.00001f)
        curveTo(13.4027f, 1.99601f, 14.1419f, 3.37449f, 15.6204f, 6.13145f)
        lineTo(15.8647f, 6.58709f)
        curveTo(16.7821f, 8.29766f, 17.2407f, 9.15294f, 16.8728f, 9.68491f)
        curveTo(16.5048f, 10.2169f, 15.6024f, 10.0032f, 13.7975f, 9.5758f)
        lineTo(13.715f, 9.55628f)
        }
        }.build()

        return _recycle01!!
    }

private var _recycle01: ImageVector? = null
