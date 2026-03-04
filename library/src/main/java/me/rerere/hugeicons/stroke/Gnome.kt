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
        moveTo(12f, 12f)
        curveTo(14.5827f, 12f, 16.9032f, 12.3863f, 18.5f, 13f)
        curveTo(18.5f, 12.0201f, 18.2223f, 11.0603f, 17.699f, 10.2318f)
        lineTo(12.767f, 2.42274f)
        curveTo(12.6008f, 2.15958f, 12.3113f, 2f, 12f, 2f)
        curveTo(11.6887f, 2f, 11.3992f, 2.15958f, 11.233f, 2.42274f)
        lineTo(6.30099f, 10.2318f)
        curveTo(5.77773f, 11.0603f, 5.5f, 12.0201f, 5.5f, 13f)
        curveTo(7.09679f, 12.3863f, 9.41727f, 12f, 12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.5f)
        curveTo(16f, 12.5f, 16.5f, 13.3f, 16.5f, 14.5f)
        curveTo(16.5f, 14.5f, 16.5f, 16.5f, 15f, 16.5f)
        curveTo(13.5f, 16.5f, 13.5f, 15f, 12f, 15f)
        curveTo(10.5f, 15f, 10.5f, 16.5f, 9f, 16.5f)
        curveTo(7.5f, 16.5f, 7.5f, 14.5f, 7.5f, 14.5f)
        curveTo(7.5f, 13.3f, 8f, 12.5f, 8f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 13f)
        curveTo(18.5f, 13f, 19f, 13.9f, 19f, 15.5f)
        curveTo(19f, 17.5f, 17.7385f, 18.6308f, 16f, 19.5f)
        curveTo(14.5895f, 20.2053f, 13.4277f, 21.1592f, 12.8653f, 21.6603f)
        curveTo(12.6263f, 21.8733f, 12.3201f, 22f, 12f, 22f)
        curveTo(11.6799f, 22f, 11.3737f, 21.8733f, 11.1347f, 21.6603f)
        curveTo(10.5723f, 21.1592f, 9.41051f, 20.2053f, 8f, 19.5f)
        curveTo(6.26155f, 18.6308f, 5f, 17.5f, 5f, 15.5f)
        curveTo(5f, 13.9f, 5.5f, 13f, 5.5f, 13f)
        }
        }.build()

        return _gnome!!
    }

private var _gnome: ImageVector? = null
