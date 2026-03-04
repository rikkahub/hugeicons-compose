package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Glove: ImageVector
    get() {
        if (_glove != null) {
            return _glove!!
        }
        _glove = ImageVector.Builder(
            name = "Glove",
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
        moveTo(13.2821f, 21f)
        horizontalLineTo(12.202f)
        curveTo(10.2655f, 21f, 9.29724f, 21f, 8.464f, 20.5777f)
        curveTo(7.63076f, 20.1554f, 7.04981f, 19.3703f, 5.88792f, 17.8f)
        lineTo(3.41438f, 14.4571f)
        curveTo(2.79576f, 13.621f, 2.87779f, 12.4511f, 3.60684f, 11.7121f)
        curveTo(4.49835f, 10.8085f, 5.97278f, 10.9147f, 6.72926f, 11.9371f)
        lineTo(8.25569f, 14f)
        verticalLineTo(9.42066f)
        curveTo(8.25569f, 9.03006f, 8.25569f, 8.83476f, 8.26466f, 8.66978f)
        curveTo(8.43073f, 5.61591f, 10.8365f, 3.17742f, 13.8493f, 3.00909f)
        curveTo(14.0121f, 3f, 14.2048f, 3f, 14.5901f, 3f)
        curveTo(15.0368f, 3f, 15.2602f, 3f, 15.44f, 3.01111f)
        curveTo(18.8039f, 3.21885f, 21.3181f, 6.22724f, 20.9673f, 9.62464f)
        curveTo(20.9485f, 9.80626f, 20.9118f, 10.0296f, 20.8384f, 10.4762f)
        lineTo(20.0657f, 15.1752f)
        curveTo(19.6781f, 17.5327f, 19.4843f, 18.7114f, 18.8157f, 19.5373f)
        curveTo(18.5131f, 19.9111f, 18.1461f, 20.2262f, 17.7326f, 20.4673f)
        curveTo(16.819f, 21f, 15.64f, 21f, 13.2821f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17f)
        horizontalLineTo(12f)
        }
        }.build()

        return _glove!!
    }

private var _glove: ImageVector? = null
