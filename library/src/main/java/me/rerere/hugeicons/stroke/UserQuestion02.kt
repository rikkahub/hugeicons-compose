package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserQuestion02: ImageVector
    get() {
        if (_userQuestion02 != null) {
            return _userQuestion02!!
        }
        _userQuestion02 = ImageVector.Builder(
            name = "UserQuestion02",
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
        moveTo(14.5f, 8.5f)
        curveTo(14.5f, 5.73858f, 12.2614f, 3.5f, 9.5f, 3.5f)
        curveTo(6.73858f, 3.5f, 4.5f, 5.73858f, 4.5f, 8.5f)
        curveTo(4.5f, 11.2614f, 6.73858f, 13.5f, 9.5f, 13.5f)
        curveTo(12.2614f, 13.5f, 14.5f, 11.2614f, 14.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 20.5f)
        curveTo(16.5f, 16.634f, 13.366f, 13.5f, 9.5f, 13.5f)
        curveTo(5.63401f, 13.5f, 2.5f, 16.634f, 2.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9.84615f)
        curveTo(17.5f, 8.82655f, 18.3954f, 8f, 19.5f, 8f)
        curveTo(20.6046f, 8f, 21.5f, 8.82655f, 21.5f, 9.84615f)
        curveTo(21.5f, 10.2137f, 21.3837f, 10.5561f, 21.1831f, 10.8438f)
        curveTo(20.5854f, 11.7012f, 19.5f, 12.0189f, 19.5f, 13.0385f)
        verticalLineTo(13.5f)
        moveTo(19.4902f, 16f)
        horizontalLineTo(19.4992f)
        }
        }.build()

        return _userQuestion02!!
    }

private var _userQuestion02: ImageVector? = null
