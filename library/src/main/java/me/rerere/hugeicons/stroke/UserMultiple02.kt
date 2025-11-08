package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserMultiple02: ImageVector
    get() {
        if (_userMultiple02 != null) {
            return _userMultiple02!!
        }
        _userMultiple02 = ImageVector.Builder(
            name = "UserMultiple02",
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
        moveTo(13f, 7f)
        curveTo(13f, 9.20914f, 11.2091f, 11f, 9f, 11f)
        curveTo(6.79086f, 11f, 5f, 9.20914f, 5f, 7f)
        curveTo(5f, 4.79086f, 6.79086f, 3f, 9f, 3f)
        curveTo(11.2091f, 3f, 13f, 4.79086f, 13f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 11f)
        curveTo(17.2091f, 11f, 19f, 9.20914f, 19f, 7f)
        curveTo(19f, 4.79086f, 17.2091f, 3f, 15f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 14f, 2f, 16.2386f, 2f, 19f)
        curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
        horizontalLineTo(14f)
        curveTo(15.1046f, 21f, 16f, 20.1046f, 16f, 19f)
        curveTo(16f, 16.2386f, 13.7614f, 14f, 11f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        curveTo(19.7614f, 14f, 22f, 16.2386f, 22f, 19f)
        curveTo(22f, 20.1046f, 21.1046f, 21f, 20f, 21f)
        horizontalLineTo(18.5f)
        }
        }.build()

        return _userMultiple02!!
    }

private var _userMultiple02: ImageVector? = null
