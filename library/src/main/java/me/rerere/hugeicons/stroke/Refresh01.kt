package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Refresh01: ImageVector
    get() {
        if (_refresh01 != null) {
            return _refresh01!!
        }
        _refresh01 = ImageVector.Builder(
            name = "Refresh01",
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
        moveTo(20.4879f, 15f)
        curveTo(19.2524f, 18.4956f, 15.9187f, 21f, 12f, 21f)
        curveTo(7.02943f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02943f, 7.02943f, 3f, 12f, 3f)
        curveTo(15.7292f, 3f, 18.9286f, 5.26806f, 20.2941f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        horizontalLineTo(18f)
        curveTo(19.4142f, 9f, 20.1213f, 9f, 20.5607f, 8.56066f)
        curveTo(21f, 8.12132f, 21f, 7.41421f, 21f, 6f)
        verticalLineTo(3f)
        }
        }.build()

        return _refresh01!!
    }

private var _refresh01: ImageVector? = null
