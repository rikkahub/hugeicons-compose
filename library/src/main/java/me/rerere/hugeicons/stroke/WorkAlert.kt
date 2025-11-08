package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkAlert: ImageVector
    get() {
        if (_workAlert != null) {
            return _workAlert!!
        }
        _workAlert = ImageVector.Builder(
            name = "WorkAlert",
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
        moveTo(11.0065f, 21f)
        horizontalLineTo(9.60546f)
        curveTo(6.02021f, 21f, 4.22759f, 21f, 3.11379f, 19.865f)
        curveTo(2f, 18.7301f, 2f, 16.9034f, 2f, 13.25f)
        curveTo(2f, 9.59661f, 2f, 7.76992f, 3.11379f, 6.63496f)
        curveTo(4.22759f, 5.5f, 6.02021f, 5.5f, 9.60546f, 5.5f)
        horizontalLineTo(13.4082f)
        curveTo(16.9934f, 5.5f, 18.7861f, 5.5f, 19.8999f, 6.63496f)
        curveTo(20.7568f, 7.50819f, 20.9544f, 8.7909f, 21f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 19.525f)
        horizontalLineTo(17.5081f)
        moveTo(17.5088f, 17.5f)
        verticalLineTo(15.475f)
        moveTo(22f, 17.5f)
        curveTo(22f, 19.9853f, 19.9853f, 22f, 17.5f, 22f)
        curveTo(15.0147f, 22f, 13f, 19.9853f, 13f, 17.5f)
        curveTo(13f, 15.0147f, 15.0147f, 13f, 17.5f, 13f)
        curveTo(19.9853f, 13f, 22f, 15.0147f, 22f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5.5f)
        lineTo(15.9007f, 5.19094f)
        curveTo(15.4056f, 3.65089f, 15.1581f, 2.88087f, 14.5689f, 2.44043f)
        curveTo(13.9796f, 2f, 13.197f, 2f, 11.6316f, 2f)
        horizontalLineTo(11.3684f)
        curveTo(9.80304f, 2f, 9.02036f, 2f, 8.43111f, 2.44043f)
        curveTo(7.84186f, 2.88087f, 7.59436f, 3.65089f, 7.09934f, 5.19094f)
        lineTo(7f, 5.5f)
        }
        }.build()

        return _workAlert!!
    }

private var _workAlert: ImageVector? = null
