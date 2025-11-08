package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = ImageVector.Builder(
            name = "Twitter",
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
        moveTo(2f, 18.5f)
        curveTo(3.76504f, 19.521f, 5.81428f, 20f, 8f, 20f)
        curveTo(14.4808f, 20f, 19.7617f, 14.8625f, 19.9922f, 8.43797f)
        lineTo(22f, 4.5f)
        lineTo(18.6458f, 5f)
        curveTo(17.9407f, 4.37764f, 17.0144f, 4f, 16f, 4f)
        curveTo(13.4276f, 4f, 11.5007f, 6.51734f, 12.1209f, 8.98003f)
        curveTo(8.56784f, 9.20927f, 5.34867f, 7.0213f, 3.48693f, 4.10523f)
        curveTo(2.25147f, 8.30185f, 3.39629f, 13.3561f, 6.5f, 16.4705f)
        curveTo(6.5f, 17.647f, 3.5f, 18.3488f, 2f, 18.5f)
        }
        }.build()

        return _twitter!!
    }

private var _twitter: ImageVector? = null
