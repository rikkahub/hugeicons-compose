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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.7821f, 21f)
        horizontalLineTo(12.702f)
        curveTo(10.7655f, 21f, 9.79724f, 21f, 8.964f, 20.5777f)
        curveTo(8.13076f, 20.1554f, 7.54981f, 19.3703f, 6.38792f, 17.8f)
        lineTo(3.91438f, 14.4571f)
        curveTo(3.29576f, 13.621f, 3.37779f, 12.4511f, 4.10684f, 11.7121f)
        curveTo(4.99835f, 10.8085f, 6.47278f, 10.9147f, 7.22926f, 11.9371f)
        lineTo(8.75569f, 14f)
        verticalLineTo(9.42066f)
        curveTo(8.75569f, 9.03006f, 8.75569f, 8.83476f, 8.76466f, 8.66978f)
        curveTo(8.93073f, 5.61591f, 11.3365f, 3.17742f, 14.3493f, 3.00909f)
        curveTo(14.5121f, 3f, 14.7048f, 3f, 15.0901f, 3f)
        curveTo(15.5368f, 3f, 15.7602f, 3f, 15.94f, 3.01111f)
        curveTo(19.3039f, 3.21885f, 21.8181f, 6.22724f, 21.4673f, 9.62464f)
        curveTo(21.4485f, 9.80626f, 21.4118f, 10.0296f, 21.3384f, 10.4762f)
        lineTo(20.5657f, 15.1752f)
        curveTo(20.1781f, 17.5327f, 19.9843f, 18.7114f, 19.3157f, 19.5373f)
        curveTo(19.0131f, 19.9111f, 18.6461f, 20.2262f, 18.2326f, 20.4673f)
        curveTo(17.319f, 21f, 16.14f, 21f, 13.7821f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 17f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _glove!!
    }

private var _glove: ImageVector? = null
