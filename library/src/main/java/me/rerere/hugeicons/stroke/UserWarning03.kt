package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserWarning03: ImageVector
    get() {
        if (_userWarning03 != null) {
            return _userWarning03!!
        }
        _userWarning03 = ImageVector.Builder(
            name = "UserWarning03",
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
        moveTo(15.5f, 7f)
        curveTo(15.5f, 9.20914f, 13.7091f, 11f, 11.5f, 11f)
        curveTo(9.29086f, 11f, 7.5f, 9.20914f, 7.5f, 7f)
        curveTo(7.5f, 4.79086f, 9.29086f, 3f, 11.5f, 3f)
        curveTo(13.7091f, 3f, 15.5f, 4.79086f, 15.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 14f)
        horizontalLineTo(9.5f)
        curveTo(6.73858f, 14f, 4.5f, 16.2386f, 4.5f, 19f)
        curveTo(4.5f, 20.1046f, 5.39543f, 21f, 6.5f, 21f)
        horizontalLineTo(16.5f)
        curveTo(17.6046f, 21f, 18.5f, 20.1046f, 18.5f, 19f)
        curveTo(18.5f, 16.2386f, 16.2614f, 14f, 13.5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 13f)
        verticalLineTo(13.01f)
        }
        }.build()

        return _userWarning03!!
    }

private var _userWarning03: ImageVector? = null
