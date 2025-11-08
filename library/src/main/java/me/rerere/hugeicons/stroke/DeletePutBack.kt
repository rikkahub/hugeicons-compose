package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeletePutBack: ImageVector
    get() {
        if (_deletePutBack != null) {
            return _deletePutBack!!
        }
        _deletePutBack = ImageVector.Builder(
            name = "DeletePutBack",
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
        moveTo(4.47461f, 6.10018f)
        lineTo(5.31543f, 18.1768f)
        curveTo(5.40886f, 19.3365f, 6.28178f, 21.5536f, 8.51889f, 21.8022f)
        curveTo(10.756f, 22.0507f, 15.2503f, 21.9951f, 16.0699f, 21.9951f)
        curveTo(16.8895f, 21.9951f, 19.0128f, 21.4136f, 19.0128f, 19.0059f)
        curveTo(19.0128f, 16.5756f, 16.9833f, 15.9419f, 15.7077f, 15.9635f)
        horizontalLineTo(12.0554f)
        moveTo(12.0554f, 15.9635f)
        curveTo(12.0607f, 15.7494f, 12.1515f, 15.5372f, 12.3278f, 15.3828f)
        lineTo(14.487f, 13.4924f)
        moveTo(12.0554f, 15.9635f)
        curveTo(12.0497f, 16.1919f, 12.1412f, 16.4224f, 12.33f, 16.5864f)
        lineTo(14.487f, 18.4609f)
        moveTo(19.4701f, 5.82422f)
        lineTo(19.0023f, 13.4792f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.49561f)
        horizontalLineTo(21f)
        moveTo(16.0555f, 5.49561f)
        lineTo(15.3729f, 4.08911f)
        curveTo(14.9194f, 3.15481f, 14.6926f, 2.68766f, 14.3015f, 2.39631f)
        curveTo(14.2148f, 2.33168f, 14.1229f, 2.2742f, 14.0268f, 2.22442f)
        curveTo(13.5937f, 2f, 13.0739f, 2f, 12.0343f, 2f)
        curveTo(10.9686f, 2f, 10.4358f, 2f, 9.99549f, 2.23383f)
        curveTo(9.89791f, 2.28565f, 9.80479f, 2.34547f, 9.7171f, 2.41265f)
        curveTo(9.32145f, 2.7158f, 9.10044f, 3.20004f, 8.65842f, 4.16854f)
        lineTo(8.05273f, 5.49561f)
        }
        }.build()

        return _deletePutBack!!
    }

private var _deletePutBack: ImageVector? = null
