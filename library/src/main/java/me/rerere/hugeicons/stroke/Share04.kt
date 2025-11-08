package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share04: ImageVector
    get() {
        if (_share04 != null) {
            return _share04!!
        }
        _share04 = ImageVector.Builder(
            name = "Share04",
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
        moveTo(10.0017f, 3f)
        curveTo(7.05534f, 3.03208f, 5.41096f, 3.21929f, 4.31838f, 4.31188f)
        curveTo(2.99988f, 5.63037f, 2.99988f, 7.75248f, 2.99988f, 11.9966f)
        curveTo(2.99988f, 16.2409f, 2.99988f, 18.363f, 4.31838f, 19.6815f)
        curveTo(5.63688f, 21f, 7.75899f, 21f, 12.0032f, 21f)
        curveTo(16.2474f, 21f, 18.3695f, 21f, 19.688f, 19.6815f)
        curveTo(20.7808f, 18.5887f, 20.9678f, 16.9438f, 20.9999f, 13.9963f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3f)
        horizontalLineTo(18f)
        curveTo(19.4142f, 3f, 20.1213f, 3f, 20.5607f, 3.43934f)
        curveTo(21f, 3.87868f, 21f, 4.58579f, 21f, 6f)
        verticalLineTo(10f)
        moveTo(20f, 4f)
        lineTo(11f, 13f)
        }
        }.build()

        return _share04!!
    }

private var _share04: ImageVector? = null
