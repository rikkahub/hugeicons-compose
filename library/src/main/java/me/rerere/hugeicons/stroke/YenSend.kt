package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.YenSend: ImageVector
    get() {
        if (_yenSend != null) {
            return _yenSend!!
        }
        _yenSend = ImageVector.Builder(
            name = "YenSend",
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
        moveTo(2f, 3.5f)
        curveTo(2.36667f, 5.03909f, 3.98f, 8.53704f, 7.5f, 10.216f)
        moveTo(7.5f, 10.216f)
        curveTo(11.02f, 8.53704f, 12.6333f, 5.03909f, 13f, 3.5f)
        moveTo(7.5f, 10.216f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 13.5f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17.5f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13f)
        horizontalLineTo(14.5f)
        moveTo(22f, 13f)
        curveTo(22f, 13.7002f, 20.0057f, 15.0085f, 19.5f, 15.5f)
        moveTo(22f, 13f)
        curveTo(22f, 12.2998f, 20.0057f, 10.9915f, 19.5f, 10.5f)
        }
        }.build()

        return _yenSend!!
    }

private var _yenSend: ImageVector? = null
