package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Attachment02: ImageVector
    get() {
        if (_attachment02 != null) {
            return _attachment02!!
        }
        _attachment02 = ImageVector.Builder(
            name = "Attachment02",
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
        moveTo(8f, 8.00049f)
        verticalLineTo(6.00049f)
        curveTo(8f, 3.79135f, 9.79086f, 2.00049f, 12f, 2.00049f)
        curveTo(14.2091f, 2.00049f, 16f, 3.79135f, 16f, 6.00049f)
        verticalLineTo(18.0005f)
        curveTo(16f, 20.2096f, 14.2091f, 22.0005f, 12f, 22.0005f)
        curveTo(9.79086f, 22.0005f, 8f, 20.2096f, 8f, 18.0005f)
        verticalLineTo(13.5005f)
        curveTo(8f, 12.1198f, 9.11929f, 11.0005f, 10.5f, 11.0005f)
        curveTo(11.8807f, 11.0005f, 13f, 12.1198f, 13f, 13.5005f)
        verticalLineTo(16.0005f)
        }
        }.build()

        return _attachment02!!
    }

private var _attachment02: ImageVector? = null
