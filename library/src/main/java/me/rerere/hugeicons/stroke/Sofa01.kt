package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sofa01: ImageVector
    get() {
        if (_sofa01 != null) {
            return _sofa01!!
        }
        _sofa01 = ImageVector.Builder(
            name = "Sofa01",
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
        moveTo(6f, 17f)
        verticalLineTo(20f)
        moveTo(18f, 17f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9f)
        curveTo(20f, 7.13077f, 20f, 6.19615f, 19.5981f, 5.5f)
        curveTo(19.3348f, 5.04394f, 18.9561f, 4.66523f, 18.5f, 4.40192f)
        curveTo(17.8038f, 4f, 16.8692f, 4f, 15f, 4f)
        horizontalLineTo(9f)
        curveTo(7.13077f, 4f, 6.19615f, 4f, 5.5f, 4.40192f)
        curveTo(5.04394f, 4.66523f, 4.66523f, 5.04394f, 4.40192f, 5.5f)
        curveTo(4f, 6.19615f, 4f, 7.13077f, 4f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9f)
        curveTo(18.8954f, 9f, 18f, 9.89543f, 18f, 11f)
        verticalLineTo(13f)
        curveTo(18f, 13.8273f, 17.8273f, 14f, 17f, 14f)
        horizontalLineTo(7f)
        curveTo(6.17267f, 14f, 6f, 13.8273f, 6f, 13f)
        verticalLineTo(11f)
        curveTo(6f, 9.89543f, 5.10457f, 9f, 4f, 9f)
        curveTo(2.89543f, 9f, 2f, 9.89543f, 2f, 11f)
        curveTo(2f, 11.7403f, 2.4022f, 12.3866f, 3f, 12.7324f)
        verticalLineTo(13f)
        curveTo(3f, 14.8856f, 3f, 15.8284f, 3.58579f, 16.4142f)
        curveTo(4.17157f, 17f, 5.11438f, 17f, 7f, 17f)
        horizontalLineTo(17f)
        curveTo(18.8856f, 17f, 19.8284f, 17f, 20.4142f, 16.4142f)
        curveTo(21f, 15.8284f, 21f, 14.8856f, 21f, 13f)
        verticalLineTo(12.7324f)
        curveTo(21.5978f, 12.3866f, 22f, 11.7403f, 22f, 11f)
        curveTo(22f, 9.89543f, 21.1046f, 9f, 20f, 9f)
        }
        }.build()

        return _sofa01!!
    }

private var _sofa01: ImageVector? = null
