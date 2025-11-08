package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gnome: ImageVector
    get() {
        if (_gnome != null) {
            return _gnome!!
        }
        _gnome = ImageVector.Builder(
            name = "Gnome",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12.5f)
        curveTo(14.5827f, 12.5f, 16.9032f, 12.8863f, 18.5f, 13.5f)
        curveTo(18.5f, 12.5201f, 18.2223f, 11.5603f, 17.699f, 10.7318f)
        lineTo(12.767f, 2.92274f)
        curveTo(12.6008f, 2.65958f, 12.3113f, 2.5f, 12f, 2.5f)
        curveTo(11.6887f, 2.5f, 11.3992f, 2.65958f, 11.233f, 2.92274f)
        lineTo(6.30099f, 10.7318f)
        curveTo(5.77773f, 11.5603f, 5.5f, 12.5201f, 5.5f, 13.5f)
        curveTo(7.09679f, 12.8863f, 9.41727f, 12.5f, 12f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        curveTo(16f, 13f, 16.5f, 13.8f, 16.5f, 15f)
        curveTo(16.5f, 15f, 16.5f, 17f, 15f, 17f)
        curveTo(13.5f, 17f, 13.5f, 15.5f, 12f, 15.5f)
        curveTo(10.5f, 15.5f, 10.5f, 17f, 9f, 17f)
        curveTo(7.5f, 17f, 7.5f, 15f, 7.5f, 15f)
        curveTo(7.5f, 13.8f, 8f, 13f, 8f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 13.5f)
        curveTo(18.5f, 13.5f, 19f, 14.4f, 19f, 16f)
        curveTo(19f, 18f, 17.7385f, 19.1308f, 16f, 20f)
        curveTo(14.5895f, 20.7053f, 13.4277f, 21.6592f, 12.8653f, 22.1603f)
        curveTo(12.6263f, 22.3733f, 12.3201f, 22.5f, 12f, 22.5f)
        curveTo(11.6799f, 22.5f, 11.3737f, 22.3733f, 11.1347f, 22.1603f)
        curveTo(10.5723f, 21.6592f, 9.41051f, 20.7053f, 8f, 20f)
        curveTo(6.26155f, 19.1308f, 5f, 18f, 5f, 16f)
        curveTo(5f, 14.4f, 5.5f, 13.5f, 5.5f, 13.5f)
        }
        }.build()

        return _gnome!!
    }

private var _gnome: ImageVector? = null
