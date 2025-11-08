package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = ImageVector.Builder(
            name = "UserSwitch",
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
        moveTo(17f, 17f)
        curveTo(15.6193f, 17f, 14.5f, 15.8807f, 14.5f, 14.5f)
        curveTo(14.5f, 13.1193f, 15.6193f, 12f, 17f, 12f)
        curveTo(18.3807f, 12f, 19.5f, 13.1193f, 19.5f, 14.5f)
        curveTo(19.5f, 15.8807f, 18.3807f, 17f, 17f, 17f)
        moveTo(17f, 17f)
        curveTo(19.4853f, 17f, 21.5f, 19.0147f, 21.5f, 21.5f)
        moveTo(17f, 17f)
        curveTo(14.5147f, 17f, 12.5f, 19.0147f, 12.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7.5f)
        curveTo(5.61929f, 7.5f, 4.5f, 6.38071f, 4.5f, 5f)
        curveTo(4.5f, 3.61929f, 5.61929f, 2.5f, 7f, 2.5f)
        curveTo(8.38071f, 2.5f, 9.5f, 3.61929f, 9.5f, 5f)
        curveTo(9.5f, 6.38071f, 8.38071f, 7.5f, 7f, 7.5f)
        moveTo(7f, 7.5f)
        curveTo(9.48528f, 7.5f, 11.5f, 9.51472f, 11.5f, 12f)
        moveTo(7f, 7.5f)
        curveTo(4.51472f, 7.5f, 2.5f, 9.51472f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 15.5f)
        curveTo(3.5f, 18.2643f, 5.73571f, 20.5f, 8.5f, 20.5f)
        lineTo(8f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 8.5f)
        curveTo(18.5f, 5.73571f, 16.2643f, 3.5f, 13.5f, 3.5f)
        lineTo(14f, 5.5f)
        }
        }.build()

        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
