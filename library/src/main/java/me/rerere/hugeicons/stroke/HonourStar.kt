package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HonourStar: ImageVector
    get() {
        if (_honourStar != null) {
            return _honourStar!!
        }
        _honourStar = ImageVector.Builder(
            name = "HonourStar",
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
        moveTo(2.5f, 3.00195f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 3.00195f)
        verticalLineTo(14.001f)
        curveTo(4.5f, 16.3298f, 4.93059f, 17.0903f, 6.92752f, 18.2885f)
        lineTo(9.94202f, 20.0972f)
        curveTo(10.9447f, 20.6987f, 11.446f, 20.9996f, 12f, 20.9996f)
        curveTo(12.554f, 20.9996f, 13.0553f, 20.6987f, 14.058f, 20.0972f)
        lineTo(17.0725f, 18.2885f)
        curveTo(19.0694f, 17.0903f, 19.5f, 16.3298f, 19.5f, 14.001f)
        verticalLineTo(3.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6045f, 8.00546f)
        lineTo(13.2204f, 9.24751f)
        curveTo(13.3044f, 9.4204f, 13.5284f, 9.58625f, 13.7173f, 9.618f)
        lineTo(14.8337f, 9.80501f)
        curveTo(15.5476f, 9.92498f, 15.7156f, 10.4472f, 15.2012f, 10.9624f)
        lineTo(14.3333f, 11.8374f)
        curveTo(14.1863f, 11.9856f, 14.1058f, 12.2715f, 14.1513f, 12.4761f)
        lineTo(14.3998f, 13.5594f)
        curveTo(14.5957f, 14.4168f, 14.1443f, 14.7485f, 13.3919f, 14.3004f)
        lineTo(12.3455f, 13.6758f)
        curveTo(12.1565f, 13.5629f, 11.845f, 13.5629f, 11.6526f, 13.6758f)
        lineTo(10.6062f, 14.3004f)
        curveTo(9.85726f, 14.7485f, 9.40231f, 14.4133f, 9.59829f, 13.5594f)
        lineTo(9.84676f, 12.4761f)
        curveTo(9.89226f, 12.2715f, 9.81177f, 11.9856f, 9.66478f, 11.8374f)
        lineTo(8.79688f, 10.9624f)
        curveTo(8.28594f, 10.4472f, 8.45042f, 9.92498f, 9.16434f, 9.80501f)
        lineTo(10.2807f, 9.618f)
        curveTo(10.4662f, 9.58625f, 10.6902f, 9.4204f, 10.7742f, 9.24751f)
        lineTo(11.3901f, 8.00546f)
        curveTo(11.7261f, 7.33151f, 12.272f, 7.33151f, 12.6045f, 8.00546f)
        }
        }.build()

        return _honourStar!!
    }

private var _honourStar: ImageVector? = null
