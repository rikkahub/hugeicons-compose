package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = ImageVector.Builder(
            name = "Star",
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
        moveTo(13.7276f, 3.44418f)
        lineTo(15.4874f, 6.99288f)
        curveTo(15.7274f, 7.48687f, 16.3673f, 7.9607f, 16.9073f, 8.05143f)
        lineTo(20.0969f, 8.58575f)
        curveTo(22.1367f, 8.92853f, 22.6167f, 10.4206f, 21.1468f, 11.8925f)
        lineTo(18.6671f, 14.3927f)
        curveTo(18.2471f, 14.8161f, 18.0172f, 15.6327f, 18.1471f, 16.2175f)
        lineTo(18.8571f, 19.3125f)
        curveTo(19.417f, 21.7623f, 18.1271f, 22.71f, 15.9774f, 21.4296f)
        lineTo(12.9877f, 19.6452f)
        curveTo(12.4478f, 19.3226f, 11.5579f, 19.3226f, 11.0079f, 19.6452f)
        lineTo(8.01827f, 21.4296f)
        curveTo(5.8785f, 22.71f, 4.57865f, 21.7522f, 5.13859f, 19.3125f)
        lineTo(5.84851f, 16.2175f)
        curveTo(5.97849f, 15.6327f, 5.74852f, 14.8161f, 5.32856f, 14.3927f)
        lineTo(2.84884f, 11.8925f)
        curveTo(1.389f, 10.4206f, 1.85895f, 8.92853f, 3.89872f, 8.58575f)
        lineTo(7.08837f, 8.05143f)
        curveTo(7.61831f, 7.9607f, 8.25824f, 7.48687f, 8.49821f, 6.99288f)
        lineTo(10.258f, 3.44418f)
        curveTo(11.2179f, 1.51861f, 12.7777f, 1.51861f, 13.7276f, 3.44418f)
        }
        }.build()

        return _star!!
    }

private var _star: ImageVector? = null
