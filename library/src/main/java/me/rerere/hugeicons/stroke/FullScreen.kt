package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FullScreen: ImageVector
    get() {
        if (_fullScreen != null) {
            return _fullScreen!!
        }
        _fullScreen = ImageVector.Builder(
            name = "FullScreen",
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
        moveTo(15.5f, 21f)
        curveTo(16.8956f, 21f, 17.5933f, 21f, 18.1611f, 20.8278f)
        curveTo(19.4395f, 20.44f, 20.44f, 19.4395f, 20.8278f, 18.1611f)
        curveTo(21f, 17.5933f, 21f, 16.8956f, 21f, 15.5f)
        moveTo(21f, 8.5f)
        curveTo(21f, 7.10444f, 21f, 6.40666f, 20.8278f, 5.83886f)
        curveTo(20.44f, 4.56046f, 19.4395f, 3.56004f, 18.1611f, 3.17224f)
        curveTo(17.5933f, 3f, 16.8956f, 3f, 15.5f, 3f)
        moveTo(8.5f, 21f)
        curveTo(7.10444f, 21f, 6.40666f, 21f, 5.83886f, 20.8278f)
        curveTo(4.56046f, 20.44f, 3.56004f, 19.4395f, 3.17224f, 18.1611f)
        curveTo(3f, 17.5933f, 3f, 16.8956f, 3f, 15.5f)
        moveTo(3f, 8.5f)
        curveTo(3f, 7.10444f, 3f, 6.40666f, 3.17224f, 5.83886f)
        curveTo(3.56004f, 4.56046f, 4.56046f, 3.56004f, 5.83886f, 3.17224f)
        curveTo(6.40666f, 3f, 7.10444f, 3f, 8.5f, 3f)
        }
        }.build()

        return _fullScreen!!
    }

private var _fullScreen: ImageVector? = null
