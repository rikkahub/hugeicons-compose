package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Building01: ImageVector
    get() {
        if (_building01 != null) {
            return _building01!!
        }
        _building01 = ImageVector.Builder(
            name = "Building01",
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
        moveTo(4f, 22f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9f)
        horizontalLineTo(14f)
        moveTo(18f, 13f)
        horizontalLineTo(14f)
        moveTo(18f, 17f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 22f)
        verticalLineTo(3.2f)
        curveTo(6f, 2.42385f, 6.47098f, 2f, 7.2f, 2f)
        curveTo(8.87221f, 2f, 9.70832f, 2f, 10.4079f, 2.1108f)
        curveTo(14.2589f, 2.72075f, 17.2793f, 5.74106f, 17.8892f, 9.59209f)
        curveTo(18f, 10.2917f, 18f, 11.1278f, 18f, 12.8f)
        verticalLineTo(22f)
        }
        }.build()

        return _building01!!
    }

private var _building01: ImageVector? = null
