package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Queue01: ImageVector
    get() {
        if (_queue01 != null) {
            return _queue01!!
        }
        _queue01 = ImageVector.Builder(
            name = "Queue01",
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
        moveTo(21f, 14f)
        curveTo(21f, 15.4001f, 21f, 16.1002f, 20.7275f, 16.635f)
        curveTo(20.4878f, 17.1054f, 20.1054f, 17.4878f, 19.635f, 17.7275f)
        curveTo(19.1002f, 18f, 18.4001f, 18f, 17f, 18f)
        horizontalLineTo(7f)
        curveTo(5.59987f, 18f, 4.8998f, 18f, 4.36502f, 17.7275f)
        curveTo(3.89462f, 17.4878f, 3.51217f, 17.1054f, 3.27248f, 16.635f)
        curveTo(3f, 16.1002f, 3f, 15.4001f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 14f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        horizontalLineTo(18f)
        }
        }.build()

        return _queue01!!
    }

private var _queue01: ImageVector? = null
