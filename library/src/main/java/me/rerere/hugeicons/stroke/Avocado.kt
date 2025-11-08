package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = ImageVector.Builder(
            name = "Avocado",
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
        moveTo(12f, 5f)
        curveTo(12f, 4f, 12.4f, 2f, 14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18.0412f)
        verticalLineTo(13.9588f)
        curveTo(12f, 13.167f, 12.2189f, 12.8334f, 13.1525f, 13.0797f)
        curveTo(16.2825f, 13.9053f, 16.2825f, 18.0947f, 13.1525f, 18.9203f)
        curveTo(12.2189f, 19.1666f, 12f, 18.833f, 12f, 18.0412f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 5f)
        curveTo(9.60664f, 5f, 7.66654f, 6.79086f, 7.66654f, 9f)
        curveTo(7.66654f, 10.2239f, 7.38884f, 11.5983f, 6.63817f, 12.6071f)
        curveTo(5.9201f, 13.5722f, 5.49988f, 14.7408f, 5.49988f, 16f)
        curveTo(5.49988f, 19.3137f, 8.41003f, 22f, 11.9999f, 22f)
        curveTo(15.5897f, 22f, 18.4999f, 19.3137f, 18.4999f, 16f)
        curveTo(18.4999f, 14.7408f, 18.0797f, 13.5722f, 17.3616f, 12.6071f)
        curveTo(16.6109f, 11.5983f, 16.3332f, 10.2239f, 16.3332f, 9f)
        curveTo(16.3332f, 6.79086f, 14.3931f, 5f, 11.9999f, 5f)
        }
        }.build()

        return _avocado!!
    }

private var _avocado: ImageVector? = null
