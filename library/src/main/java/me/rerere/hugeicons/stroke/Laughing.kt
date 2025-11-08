package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Laughing: ImageVector
    get() {
        if (_laughing != null) {
            return _laughing!!
        }
        _laughing = ImageVector.Builder(
            name = "Laughing",
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
        moveTo(2f, 11f)
        curveTo(2.50421f, 5.94668f, 6.78892f, 2f, 12f, 2f)
        curveTo(17.2111f, 2f, 21.4958f, 5.94668f, 22f, 11f)
        moveTo(19f, 19.1752f)
        curveTo(17.1904f, 20.9235f, 14.7215f, 22f, 12f, 22f)
        curveTo(9.27848f, 22f, 6.80962f, 20.9235f, 5f, 19.1752f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        curveTo(13.8962f, 18f, 15.4889f, 16.7202f, 15.9362f, 14.9899f)
        curveTo(16.1443f, 14.1848f, 15.8422f, 14f, 15.0461f, 14f)
        horizontalLineTo(8.95386f)
        curveTo(8.15776f, 14f, 7.8557f, 14.1848f, 8.0638f, 14.9899f)
        curveTo(8.51109f, 16.7202f, 10.1038f, 18f, 12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9.5f)
        curveTo(7f, 8.67157f, 7.67157f, 8f, 8.5f, 8f)
        curveTo(9.32843f, 8f, 10f, 8.67157f, 10f, 9.5f)
        moveTo(14f, 9.5f)
        curveTo(14f, 8.67157f, 14.6716f, 8f, 15.5f, 8f)
        curveTo(16.3284f, 8f, 17f, 8.67157f, 17f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(4.44452f, 12.3985f, 1.54103f, 13.2338f, 2.06165f, 15.782f)
        curveTo(2.33013f, 17.0421f, 3.73652f, 17.275f, 4.5f, 16.708f)
        curveTo(6.33821f, 15.343f, 4.5f, 14f, 6f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        curveTo(19.5555f, 12.3985f, 22.459f, 13.2338f, 21.9383f, 15.782f)
        curveTo(21.6699f, 17.0421f, 20.2635f, 17.275f, 19.5f, 16.708f)
        curveTo(17.6618f, 15.343f, 19.5f, 14f, 18f, 12f)
        }
        }.build()

        return _laughing!!
    }

private var _laughing: ImageVector? = null
