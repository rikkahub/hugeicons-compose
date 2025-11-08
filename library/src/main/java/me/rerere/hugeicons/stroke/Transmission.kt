package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = ImageVector.Builder(
            name = "Transmission",
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
        moveTo(5.6f, 22f)
        curveTo(5.6f, 21.1163f, 4.88366f, 20.4f, 4f, 20.4f)
        moveTo(8.8f, 22f)
        curveTo(8.8f, 19.349f, 6.65097f, 17.2f, 4f, 17.2f)
        moveTo(12f, 22f)
        curveTo(12f, 17.5817f, 8.41828f, 14f, 4f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99994f, 11f)
        verticalLineTo(9.50003f)
        curveTo(4.99994f, 6.21252f, 4.99994f, 4.56876f, 5.90791f, 3.46241f)
        curveTo(6.07412f, 3.25989f, 6.25982f, 3.07418f, 6.46235f, 2.90797f)
        curveTo(7.5687f, 2f, 9.21246f, 2f, 12.5f, 2f)
        curveTo(15.7875f, 2f, 17.4312f, 2f, 18.5376f, 2.90797f)
        curveTo(18.7401f, 3.07418f, 18.9258f, 3.25989f, 19.092f, 3.46241f)
        curveTo(20f, 4.56876f, 20f, 6.21252f, 20f, 9.50003f)
        verticalLineTo(17f)
        curveTo(20f, 17.9293f, 20f, 18.394f, 19.9231f, 18.7804f)
        curveTo(19.6075f, 20.3671f, 18.3671f, 21.6075f, 16.7804f, 21.9231f)
        curveTo(16.394f, 22f, 15.9293f, 22f, 15f, 22f)
        }
        }.build()

        return _transmission!!
    }

private var _transmission: ImageVector? = null
