package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PresentationOnline: ImageVector
    get() {
        if (_presentationOnline != null) {
            return _presentationOnline!!
        }
        _presentationOnline = ImageVector.Builder(
            name = "PresentationOnline",
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
        moveTo(5.40882f, 17.1182f)
        curveTo(5.05045f, 15.6022f, 4.87126f, 14.8442f, 5.1059f, 14.26f)
        curveTo(5.25187f, 13.8966f, 5.50214f, 13.5836f, 5.82571f, 13.3598f)
        curveTo(6.34581f, 13f, 7.13106f, 13f, 8.70154f, 13f)
        horizontalLineTo(15.2985f)
        curveTo(16.8689f, 13f, 17.6542f, 13f, 18.1743f, 13.3598f)
        curveTo(18.4979f, 13.5836f, 18.7481f, 13.8966f, 18.8941f, 14.26f)
        curveTo(19.1287f, 14.8442f, 18.9496f, 15.6022f, 18.5912f, 17.1182f)
        curveTo(18.2381f, 18.6117f, 18.0616f, 19.3584f, 17.6207f, 19.8949f)
        curveTo(17.3433f, 20.2325f, 16.9952f, 20.5061f, 16.6004f, 20.6968f)
        curveTo(15.9729f, 21f, 15.1993f, 21f, 13.6521f, 21f)
        horizontalLineTo(10.3479f)
        curveTo(8.8007f, 21f, 8.0271f, 21f, 7.39959f, 20.6968f)
        curveTo(7.00485f, 20.5061f, 6.6567f, 20.2325f, 6.37933f, 19.8949f)
        curveTo(5.9384f, 19.3584f, 5.76188f, 18.6117f, 5.40882f, 17.1182f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11f)
        curveTo(9.83846f, 8.40464f, 14.1188f, 8.26296f, 16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 5f)
        curveTo(14f, 6.10457f, 13.1046f, 7f, 12f, 7f)
        curveTo(10.8954f, 7f, 10f, 6.10457f, 10f, 5f)
        curveTo(10f, 3.89543f, 10.8954f, 3f, 12f, 3f)
        curveTo(13.1046f, 3f, 14f, 3.89543f, 14f, 5f)
        }
        }.build()

        return _presentationOnline!!
    }

private var _presentationOnline: ImageVector? = null
