package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.View: ImageVector
    get() {
        if (_view != null) {
            return _view!!
        }
        _view = ImageVector.Builder(
            name = "View",
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
        moveTo(21.544f, 11.045f)
        curveTo(21.848f, 11.4713f, 22f, 11.6845f, 22f, 12f)
        curveTo(22f, 12.3155f, 21.848f, 12.5287f, 21.544f, 12.955f)
        curveTo(20.1779f, 14.8706f, 16.6892f, 19f, 12f, 19f)
        curveTo(7.31078f, 19f, 3.8221f, 14.8706f, 2.45604f, 12.955f)
        curveTo(2.15201f, 12.5287f, 2f, 12.3155f, 2f, 12f)
        curveTo(2f, 11.6845f, 2.15201f, 11.4713f, 2.45604f, 11.045f)
        curveTo(3.8221f, 9.12944f, 7.31078f, 5f, 12f, 5f)
        curveTo(16.6892f, 5f, 20.1779f, 9.12944f, 21.544f, 11.045f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 10.3431f, 13.6569f, 9f, 12f, 9f)
        curveTo(10.3431f, 9f, 9f, 10.3431f, 9f, 12f)
        curveTo(9f, 13.6569f, 10.3431f, 15f, 12f, 15f)
        curveTo(13.6569f, 15f, 15f, 13.6569f, 15f, 12f)
        }
        }.build()

        return _view!!
    }

private var _view: ImageVector? = null
