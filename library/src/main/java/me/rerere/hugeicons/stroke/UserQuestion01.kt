package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserQuestion01: ImageVector
    get() {
        if (_userQuestion01 != null) {
            return _userQuestion01!!
        }
        _userQuestion01 = ImageVector.Builder(
            name = "UserQuestion01",
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
        moveTo(14.5f, 8f)
        curveTo(14.5f, 5.23858f, 12.2614f, 3f, 9.5f, 3f)
        curveTo(6.73858f, 3f, 4.5f, 5.23858f, 4.5f, 8f)
        curveTo(4.5f, 10.7614f, 6.73858f, 13f, 9.5f, 13f)
        curveTo(12.2614f, 13f, 14.5f, 10.7614f, 14.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 20f)
        curveTo(2.5f, 16.134f, 5.63401f, 13f, 9.5f, 13f)
        curveTo(10.775f, 13f, 11.9704f, 13.3409f, 13f, 13.9365f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 14.8462f)
        curveTo(15.5f, 13.8266f, 16.3954f, 13f, 17.5f, 13f)
        curveTo(18.6046f, 13f, 19.5f, 13.8266f, 19.5f, 14.8462f)
        curveTo(19.5f, 15.2137f, 19.3837f, 15.5561f, 19.1831f, 15.8438f)
        curveTo(18.5854f, 16.7012f, 17.5f, 17.0189f, 17.5f, 18.0385f)
        verticalLineTo(18.5f)
        moveTo(17.4902f, 21f)
        horizontalLineTo(17.4992f)
        }
        }.build()

        return _userQuestion01!!
    }

private var _userQuestion01: ImageVector? = null
