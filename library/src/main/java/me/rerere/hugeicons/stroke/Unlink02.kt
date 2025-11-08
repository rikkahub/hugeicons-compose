package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unlink02: ImageVector
    get() {
        if (_unlink02 != null) {
            return _unlink02!!
        }
        _unlink02 = ImageVector.Builder(
            name = "Unlink02",
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
        moveTo(16.8463f, 14.6095f)
        lineTo(19.4558f, 12f)
        curveTo(21.5147f, 9.94113f, 21.5147f, 6.60303f, 19.4558f, 4.54416f)
        curveTo(17.397f, 2.48528f, 14.0589f, 2.48528f, 12f, 4.54416f)
        lineTo(9.39045f, 7.1537f)
        moveTo(14.6095f, 16.8463f)
        lineTo(12f, 19.4558f)
        curveTo(9.94113f, 21.5147f, 6.60303f, 21.5147f, 4.54416f, 19.4558f)
        curveTo(2.48528f, 17.397f, 2.48528f, 14.0589f, 4.54416f, 12f)
        lineTo(7.1537f, 9.39045f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17f)
        horizontalLineTo(19.9211f)
        moveTo(17f, 22f)
        lineTo(17f, 19.9211f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(4.07889f)
        moveTo(7f, 2f)
        lineTo(7f, 4.07889f)
        }
        }.build()

        return _unlink02!!
    }

private var _unlink02: ImageVector? = null
