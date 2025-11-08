package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HelpCircle: ImageVector
    get() {
        if (_helpCircle != null) {
            return _helpCircle!!
        }
        _helpCircle = ImageVector.Builder(
            name = "HelpCircle",
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
        moveTo(9.5f, 9.5f)
        curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
        curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
        curveTo(14.5f, 10.3569f, 14.0689f, 11.1131f, 13.4117f, 11.5636f)
        curveTo(12.7283f, 12.0319f, 12f, 12.6716f, 12f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0001f, 17f)
        horizontalLineTo(12.009f)
        }
        }.build()

        return _helpCircle!!
    }

private var _helpCircle: ImageVector? = null
