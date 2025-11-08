package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeleteThrow: ImageVector
    get() {
        if (_deleteThrow != null) {
            return _deleteThrow!!
        }
        _deleteThrow = ImageVector.Builder(
            name = "DeleteThrow",
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
        moveTo(19.5f, 5.5f)
        lineTo(18.8803f, 15.5251f)
        curveTo(18.7219f, 18.0864f, 18.6428f, 19.3671f, 18.0008f, 20.2879f)
        curveTo(17.6833f, 20.7431f, 17.2747f, 21.1273f, 16.8007f, 21.416f)
        curveTo(15.8421f, 22f, 14.559f, 22f, 11.9927f, 22f)
        curveTo(9.42312f, 22f, 8.1383f, 22f, 7.17905f, 21.4149f)
        curveTo(6.7048f, 21.1257f, 6.296f, 20.7408f, 5.97868f, 20.2848f)
        curveTo(5.33688f, 19.3626f, 5.25945f, 18.0801f, 5.10461f, 15.5152f)
        lineTo(4.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 12.5f)
        curveTo(9.99153f, 11.9943f, 11.2998f, 10f, 12f, 10f)
        moveTo(14.5f, 12.5f)
        curveTo(14.0085f, 11.9943f, 12.7002f, 10f, 12f, 10f)
        moveTo(12f, 10f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.5f)
        horizontalLineTo(21f)
        moveTo(16.0555f, 5.5f)
        lineTo(15.3729f, 4.09173f)
        curveTo(14.9194f, 3.15626f, 14.6926f, 2.68852f, 14.3015f, 2.39681f)
        curveTo(14.2148f, 2.3321f, 14.1229f, 2.27454f, 14.0268f, 2.2247f)
        curveTo(13.5937f, 2f, 13.0739f, 2f, 12.0343f, 2f)
        curveTo(10.9686f, 2f, 10.4358f, 2f, 9.99549f, 2.23412f)
        curveTo(9.89791f, 2.28601f, 9.80479f, 2.3459f, 9.7171f, 2.41317f)
        curveTo(9.32145f, 2.7167f, 9.10044f, 3.20155f, 8.65842f, 4.17126f)
        lineTo(8.05273f, 5.5f)
        }
        }.build()

        return _deleteThrow!!
    }

private var _deleteThrow: ImageVector? = null
