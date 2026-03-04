package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Download06: ImageVector
    get() {
        if (_download06 != null) {
            return _download06!!
        }
        _download06 = ImageVector.Builder(
            name = "Download06",
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
        moveTo(16f, 9f)
        curveTo(17.4001f, 9f, 18.1002f, 9f, 18.635f, 9.27248f)
        curveTo(19.1054f, 9.51217f, 19.4878f, 9.89462f, 19.7275f, 10.365f)
        curveTo(20f, 10.8998f, 20f, 11.5999f, 20f, 13f)
        verticalLineTo(16f)
        curveTo(20f, 18.357f, 20f, 19.5355f, 19.2678f, 20.2678f)
        curveTo(18.5355f, 21f, 17.357f, 21f, 15f, 21f)
        horizontalLineTo(9f)
        curveTo(6.64298f, 21f, 5.46447f, 21f, 4.73223f, 20.2678f)
        curveTo(4f, 19.5355f, 4f, 18.357f, 4f, 16f)
        verticalLineTo(13f)
        curveTo(4f, 11.5999f, 4f, 10.8998f, 4.27248f, 10.365f)
        curveTo(4.51217f, 9.89462f, 4.89462f, 9.51217f, 5.36502f, 9.27248f)
        curveTo(5.8998f, 9f, 6.59987f, 9f, 8f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13f)
        curveTo(15f, 13f, 12.7905f, 16f, 12f, 16f)
        curveTo(11.2094f, 16f, 9f, 13f, 9f, 13f)
        }
        }.build()

        return _download06!!
    }

private var _download06: ImageVector? = null
