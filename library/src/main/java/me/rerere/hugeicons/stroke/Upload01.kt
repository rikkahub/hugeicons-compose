package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Upload01: ImageVector
    get() {
        if (_upload01 != null) {
            return _upload01!!
        }
        _upload01 = ImageVector.Builder(
            name = "Upload01",
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
        moveTo(2.99995f, 17f)
        curveTo(2.99995f, 17.93f, 2.99995f, 18.395f, 3.10217f, 18.7765f)
        curveTo(3.37957f, 19.8117f, 4.18821f, 20.6204f, 5.22349f, 20.8978f)
        curveTo(5.60499f, 21f, 6.06997f, 21f, 6.99995f, 21f)
        lineTo(16.9999f, 21f)
        curveTo(17.9299f, 21f, 18.3949f, 21f, 18.7764f, 20.8978f)
        curveTo(19.8117f, 20.6204f, 20.6203f, 19.8117f, 20.8977f, 18.7765f)
        curveTo(20.9999f, 18.395f, 20.9999f, 17.93f, 20.9999f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 7.49993f)
        curveTo(16.5f, 7.49993f, 13.1858f, 2.99997f, 12f, 2.99996f)
        curveTo(10.8142f, 2.99995f, 7.50002f, 7.49996f, 7.50002f, 7.49996f)
        moveTo(12f, 3.99996f)
        verticalLineTo(16f)
        }
        }.build()

        return _upload01!!
    }

private var _upload01: ImageVector? = null
