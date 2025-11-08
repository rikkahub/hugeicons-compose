package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Factory01: ImageVector
    get() {
        if (_factory01 != null) {
            return _factory01!!
        }
        _factory01 = ImageVector.Builder(
            name = "Factory01",
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
        moveTo(3f, 21f)
        curveTo(4.5f, 18f, 5.5f, 14f, 5.5f, 8f)
        horizontalLineTo(12.5f)
        curveTo(12.5f, 14f, 13.5f, 18f, 15f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4.26495f)
        curveTo(13.1704f, 2.62795f, 14.6678f, 2.62795f, 15.8382f, 4.26495f)
        curveTo(16.5439f, 5.26947f, 17.4561f, 5.23227f, 18.179f, 4.22775f)
        curveTo(19.3322f, 2.59075f, 20.8296f, 2.59075f, 22f, 4.22775f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.8496f, 12.0713f)
        horizontalLineTo(16.4036f)
        curveTo(16.5444f, 13.9094f, 16.3899f, 17.1164f, 19.6951f, 20.82f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(21f)
        }
        }.build()

        return _factory01!!
    }

private var _factory01: ImageVector? = null
