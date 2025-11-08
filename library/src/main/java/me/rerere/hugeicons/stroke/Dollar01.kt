package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dollar01: ImageVector
    get() {
        if (_dollar01 != null) {
            return _dollar01!!
        }
        _dollar01 = ImageVector.Builder(
            name = "Dollar01",
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
        moveTo(17.9583f, 8.38889f)
        curveTo(17.9583f, 6.24111f, 15.2907f, 4.5f, 12f, 4.5f)
        curveTo(8.7093f, 4.5f, 6.04167f, 6.24111f, 6.04167f, 8.38889f)
        curveTo(6.04167f, 10.5367f, 7.66667f, 11.7222f, 12f, 11.7222f)
        curveTo(16.3333f, 11.7222f, 18.5f, 12.8333f, 18.5f, 15.6111f)
        curveTo(18.5f, 18.3889f, 15.5899f, 19.5f, 12f, 19.5f)
        curveTo(8.41015f, 19.5f, 5.5f, 17.7589f, 5.5f, 15.6111f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 2.5f)
        verticalLineTo(4.21f)
        moveTo(12.5f, 21.5f)
        verticalLineTo(19.79f)
        }
        }.build()

        return _dollar01!!
    }

private var _dollar01: ImageVector? = null
