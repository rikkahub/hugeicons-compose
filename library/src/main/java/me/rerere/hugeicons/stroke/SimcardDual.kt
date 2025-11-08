package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SimcardDual: ImageVector
    get() {
        if (_simcardDual != null) {
            return _simcardDual!!
        }
        _simcardDual = ImageVector.Builder(
            name = "SimcardDual",
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
        moveTo(2f, 13.8868f)
        curveTo(2f, 10.2256f, 2f, 8.39501f, 3.07857f, 7.23516f)
        curveTo(3.11842f, 7.19231f, 3.15919f, 7.15037f, 3.20085f, 7.10939f)
        curveTo(4.32848f, 6f, 6.10821f, 6f, 9.66768f, 6f)
        curveTo(10.5112f, 6f, 10.9176f, 6.003f, 11.3044f, 6.15149f)
        curveTo(11.6769f, 6.29448f, 11.9889f, 6.56191f, 12.6129f, 7.09679f)
        lineTo(14.3209f, 8.56074f)
        curveTo(15.1466f, 9.26848f, 15.5594f, 9.62236f, 15.7797f, 10.1061f)
        curveTo(16f, 10.5899f, 16f, 11.1427f, 16f, 12.2482f)
        verticalLineTo(14.8f)
        curveTo(16f, 17.7998f, 16f, 19.2997f, 15.2573f, 20.3511f)
        curveTo(15.0174f, 20.6907f, 14.7271f, 20.9894f, 14.3969f, 21.2361f)
        curveTo(13.3747f, 22f, 11.9165f, 22f, 9f, 22f)
        curveTo(6.08354f, 22f, 4.62531f, 22f, 3.60306f, 21.2361f)
        curveTo(3.27291f, 20.9894f, 2.98258f, 20.6907f, 2.74271f, 20.3511f)
        curveTo(2f, 19.2997f, 2f, 17.7998f, 2f, 14.8f)
        verticalLineTo(13.8868f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9779f, 16f)
        curveTo(18.4869f, 16f, 19.7414f, 16f, 20.6209f, 15.3316f)
        curveTo(20.9049f, 15.1157f, 21.1547f, 14.8544f, 21.361f, 14.5572f)
        curveTo(22f, 13.6372f, 22f, 12.3248f, 22f, 9.7f)
        verticalLineTo(7.46718f)
        curveTo(22f, 6.49983f, 22f, 6.01616f, 21.8105f, 5.59286f)
        curveTo(21.621f, 5.16956f, 21.2658f, 4.85992f, 20.5554f, 4.24065f)
        lineTo(19.0861f, 2.95969f)
        curveTo(18.5492f, 2.49168f, 18.2808f, 2.25767f, 17.9604f, 2.13256f)
        curveTo(17.6276f, 2.00263f, 17.278f, 2f, 16.5523f, 2f)
        curveTo(13.4901f, 2f, 11.959f, 2f, 10.9889f, 2.97071f)
        curveTo(10.953f, 3.00658f, 10.918f, 3.04327f, 10.8837f, 3.08076f)
        curveTo(10.2922f, 3.72771f, 10.0777f, 4.61316f, 10f, 6f)
        }
        }.build()

        return _simcardDual!!
    }

private var _simcardDual: ImageVector? = null
