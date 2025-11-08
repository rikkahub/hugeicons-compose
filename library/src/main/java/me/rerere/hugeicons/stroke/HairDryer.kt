package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) {
            return _hairDryer!!
        }
        _hairDryer = ImageVector.Builder(
            name = "HairDryer",
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
        moveTo(8.69128f, 2.15168f)
        curveTo(5.80039f, 1.36313f, 3f, 3.74875f, 3f, 7f)
        curveTo(3f, 10.2513f, 5.80039f, 12.6369f, 8.69128f, 11.8483f)
        curveTo(10.9979f, 11.2192f, 14.2043f, 9.58049f, 16.6244f, 9.80217f)
        curveTo(17.5008f, 9.88246f, 18.126f, 10.6464f, 18.9467f, 10.8707f)
        curveTo(20.0559f, 11.1739f, 20.4902f, 9.50002f, 20.7285f, 8.75297f)
        curveTo(21.0905f, 7.61771f, 21.0905f, 6.38229f, 20.7285f, 5.24703f)
        curveTo(20.4902f, 4.49998f, 20.0559f, 2.82606f, 18.9467f, 3.12929f)
        curveTo(18.126f, 3.35364f, 17.5008f, 4.11755f, 16.6244f, 4.19783f)
        curveTo(14.2043f, 4.41951f, 10.9979f, 2.78085f, 8.69128f, 2.15168f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 11.5f)
        curveTo(6.87177f, 12.9095f, 6.77428f, 15.2676f, 6.8188f, 17.376f)
        curveTo(6.8373f, 18.2518f, 7.50261f, 19f, 8.34709f, 19f)
        horizontalLineTo(9.5674f)
        curveTo(10.2374f, 19f, 10.6397f, 17.4957f, 10.8465f, 17.0224f)
        curveTo(11.1215f, 16.3927f, 11.0041f, 15.6743f, 10.6757f, 15.0727f)
        curveTo(9.98228f, 13.8023f, 9.5f, 13f, 10f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 4.5f)
        lineTo(16.8789f, 6.01942f)
        curveTo(17.0404f, 6.66673f, 17.0404f, 7.33327f, 16.8789f, 7.98058f)
        lineTo(16.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        curveTo(9f, 19.9319f, 9f, 20.3978f, 8.82601f, 20.7654f)
        curveTo(8.59402f, 21.2554f, 8.14906f, 21.6448f, 7.58899f, 21.8478f)
        curveTo(7.16894f, 22f, 6.06501f, 22f, 5f, 22f)
        }
        }.build()

        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
