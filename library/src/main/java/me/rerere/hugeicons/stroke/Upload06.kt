package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Upload06: ImageVector
    get() {
        if (_upload06 != null) {
            return _upload06!!
        }
        _upload06 = ImageVector.Builder(
            name = "Upload06",
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
        moveTo(16f, 10f)
        curveTo(17.4001f, 10f, 18.1002f, 10f, 18.635f, 10.2725f)
        curveTo(19.1054f, 10.5122f, 19.4878f, 10.8946f, 19.7275f, 11.365f)
        curveTo(20f, 11.8998f, 20f, 12.5999f, 20f, 14f)
        verticalLineTo(17f)
        curveTo(20f, 19.357f, 20f, 20.5355f, 19.2678f, 21.2678f)
        curveTo(18.5355f, 22f, 17.357f, 22f, 15f, 22f)
        horizontalLineTo(9f)
        curveTo(6.64298f, 22f, 5.46447f, 22f, 4.73223f, 21.2678f)
        curveTo(4f, 20.5355f, 4f, 19.357f, 4f, 17f)
        verticalLineTo(14f)
        curveTo(4f, 12.5999f, 4f, 11.8998f, 4.27248f, 11.365f)
        curveTo(4.51217f, 10.8946f, 4.89462f, 10.5122f, 5.36502f, 10.2725f)
        curveTo(5.8998f, 10f, 6.59987f, 10f, 8f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5.99998f)
        curveTo(15f, 5.99998f, 12.7905f, 3.00001f, 12f, 3f)
        curveTo(11.2094f, 2.99999f, 9f, 6f, 9f, 6f)
        }
        }.build()

        return _upload06!!
    }

private var _upload06: ImageVector? = null
