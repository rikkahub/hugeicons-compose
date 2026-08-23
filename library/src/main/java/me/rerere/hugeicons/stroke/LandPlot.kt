package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LandPlot: ImageVector
    get() {
        if (_landPlot != null) {
            return _landPlot!!
        }
        _landPlot = ImageVector.Builder(
            name = "LandPlot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.4835f, 11.5f)
            lineTo(18.9129f, 13.4117f)
            curveTo(20.971f, 14.5591f, 22.0001f, 15.1327f, 22.0001f, 16.0001f)
            curveTo(22.0001f, 16.8675f, 20.971f, 17.4412f, 18.9129f, 18.5886f)
            lineTo(14.9668f, 20.7884f)
            curveTo(13.5176f, 21.5962f, 12.7931f, 22.0001f, 12.0001f, 22.0001f)
            curveTo(11.2071f, 22.0001f, 10.4825f, 21.5962f, 9.03335f, 20.7884f)
            lineTo(5.08727f, 18.5886f)
            curveTo(3.02913f, 17.4412f, 2.00006f, 16.8675f, 2.00006f, 16.0001f)
            curveTo(2.00006f, 15.1327f, 3.02913f, 14.5591f, 5.08727f, 13.4117f)
            lineTo(8.51657f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.25f, 12.75f)
            lineTo(6.75f, 19.25f)
            moveTo(6.75f, 12.75f)
            lineTo(17.25f, 19.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.0001f, 12f)
            verticalLineTo(8.46038f)
            moveTo(12.0001f, 8.46038f)
            lineTo(12.0001f, 4.55707f)
            curveTo(12.0001f, 3.12848f, 12.0001f, 2.41418f, 12.4527f, 2.11609f)
            curveTo(12.9053f, 1.818f, 13.5312f, 2.12007f, 14.7831f, 2.7242f)
            lineTo(15.5367f, 3.08788f)
            curveTo(17.1789f, 3.88042f, 18.0001f, 4.27669f, 18.0001f, 4.92076f)
            curveTo(18.0001f, 5.56483f, 17.1789f, 5.9611f, 15.5367f, 6.75364f)
            lineTo(12.0001f, 8.46038f)
            close()
        }
        }.build()

        return _landPlot!!
    }

private var _landPlot: ImageVector? = null
