package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dish01: ImageVector
    get() {
        if (_dish01 != null) {
            return _dish01!!
        }
        _dish01 = ImageVector.Builder(
            name = "Dish01",
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
        moveTo(2f, 17f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        curveTo(12f, 7f, 13.5f, 5.96638f, 13.5f, 4.69135f)
        curveTo(13.5f, 2.43622f, 10.5f, 2.43622f, 10.5f, 4.69135f)
        curveTo(10.5f, 5.96638f, 12f, 7f, 12f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17f)
        lineTo(3.62127f, 19.4851f)
        curveTo(3.84385f, 20.3754f, 4.64382f, 21f, 5.56155f, 21f)
        horizontalLineTo(18.4384f)
        curveTo(19.3562f, 21f, 20.1561f, 20.3754f, 20.3787f, 19.4851f)
        lineTo(21f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 14.5f)
        curveTo(20.0017f, 10.2768f, 16.3861f, 7f, 12f, 7f)
        curveTo(7.61386f, 7f, 3.99834f, 10.2768f, 3.5f, 14.5f)
        }
        }.build()

        return _dish01!!
    }

private var _dish01: ImageVector? = null
