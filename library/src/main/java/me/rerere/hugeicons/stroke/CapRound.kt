package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CapRound: ImageVector
    get() {
        if (_capRound != null) {
            return _capRound!!
        }
        _capRound = ImageVector.Builder(
            name = "CapRound",
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
        moveTo(21f, 5f)
        lineTo(10f, 5f)
        curveTo(6.13401f, 5f, 3f, 8.13401f, 3f, 12f)
        curveTo(3f, 15.866f, 6.13401f, 19f, 10f, 19f)
        lineTo(21f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        curveTo(13f, 13.3807f, 11.8807f, 14.5f, 10.5f, 14.5f)
        curveTo(9.11929f, 14.5f, 8f, 13.3807f, 8f, 12f)
        curveTo(8f, 10.6193f, 9.11929f, 9.5f, 10.5f, 9.5f)
        curveTo(11.8807f, 9.5f, 13f, 10.6193f, 13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        lineTo(21f, 12f)
        }
        }.build()

        return _capRound!!
    }

private var _capRound: ImageVector? = null
