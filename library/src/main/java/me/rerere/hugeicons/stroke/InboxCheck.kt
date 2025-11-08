package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InboxCheck: ImageVector
    get() {
        if (_inboxCheck != null) {
            return _inboxCheck!!
        }
        _inboxCheck = ImageVector.Builder(
            name = "InboxCheck",
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
        moveTo(20.9999f, 13.9824f)
        horizontalLineTo(16.0742f)
        curveTo(15.2321f, 13.9824f, 14.5705f, 14.686f, 14.1994f, 15.4296f)
        curveTo(13.7962f, 16.2375f, 12.9888f, 16.9824f, 11.4999f, 16.9824f)
        curveTo(10.011f, 16.9824f, 9.20364f, 16.2375f, 8.80045f, 15.4296f)
        curveTo(8.42933f, 14.686f, 7.76768f, 13.9824f, 6.92557f, 13.9824f)
        horizontalLineTo(1.99991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.6601f, 5.97537f)
        curveTo(16.6601f, 5.97537f, 17.0371f, 6.09064f, 17.5607f, 6.85858f)
        curveTo(17.5607f, 6.85858f, 18.3287f, 5.20059f, 19.3933f, 4.62463f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0166f, 12.4916f)
        curveTo(21.0166f, 16.9739f, 21.0166f, 19.215f, 19.6242f, 20.6076f)
        curveTo(18.2317f, 22f, 15.9905f, 22f, 11.5083f, 22f)
        curveTo(7.02599f, 22f, 4.78485f, 22f, 3.39237f, 20.6076f)
        curveTo(1.99991f, 19.215f, 1.99991f, 16.9739f, 1.99991f, 12.4916f)
        curveTo(1.99991f, 8.00935f, 1.99991f, 5.76821f, 3.39237f, 4.37574f)
        curveTo(4.78485f, 2.98328f, 7.02599f, 2.98328f, 11.5083f, 2.98328f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.0001f, 5.98324f)
        curveTo(22.0001f, 8.18312f, 20.2167f, 9.96647f, 18.0168f, 9.96647f)
        curveTo(15.817f, 9.96647f, 14.0336f, 8.18312f, 14.0336f, 5.98324f)
        curveTo(14.0336f, 3.78336f, 15.817f, 2f, 18.0168f, 2f)
        curveTo(20.2167f, 2f, 22.0001f, 3.78336f, 22.0001f, 5.98324f)
        }
        }.build()

        return _inboxCheck!!
    }

private var _inboxCheck: ImageVector? = null
