package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Yen: ImageVector
    get() {
        if (_yen != null) {
            return _yen!!
        }
        _yen = ImageVector.Builder(
            name = "Yen",
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
        moveTo(5f, 3f)
        curveTo(5.46667f, 4.73148f, 7.52f, 8.66667f, 12f, 10.5556f)
        moveTo(12f, 10.5556f)
        curveTo(16.48f, 8.66667f, 18.5333f, 4.73148f, 19f, 3f)
        moveTo(12f, 10.5556f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.16602f, 13f)
        horizontalLineTo(17.8327f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.16602f, 17f)
        horizontalLineTo(17.8327f)
        }
        }.build()

        return _yen!!
    }

private var _yen: ImageVector? = null
