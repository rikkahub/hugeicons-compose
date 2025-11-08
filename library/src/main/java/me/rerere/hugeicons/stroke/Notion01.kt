package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notion01: ImageVector
    get() {
        if (_notion01 != null) {
            return _notion01!!
        }
        _notion01 = ImageVector.Builder(
            name = "Notion01",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.42857f, 10f)
        lineTo(13.5196f, 16.3964f)
        curveTo(13.716f, 16.6432f, 13.9002f, 16.8767f, 14.2159f, 16.9639f)
        curveTo(14.3466f, 17f, 14.4882f, 17f, 14.7714f, 17f)
        curveTo(15.0515f, 17f, 15.1915f, 17f, 15.2984f, 16.9455f)
        curveTo(15.5894f, 16.7973f, 15.5714f, 16.4841f, 15.5714f, 16.2f)
        verticalLineTo(13.4286f)
        moveTo(8.42857f, 10f)
        verticalLineTo(7f)
        moveTo(8.42857f, 10f)
        verticalLineTo(17f)
        moveTo(8.42857f, 7f)
        horizontalLineTo(9.53035f)
        curveTo(10.0067f, 7f, 10.2448f, 7f, 10.4514f, 7.10018f)
        curveTo(10.6581f, 7.20035f, 10.8056f, 7.38733f, 11.1006f, 7.76128f)
        lineTo(15.5714f, 13.4286f)
        moveTo(8.42857f, 7f)
        horizontalLineTo(7f)
        moveTo(8.42857f, 17f)
        horizontalLineTo(7f)
        moveTo(8.42857f, 17f)
        horizontalLineTo(10f)
        moveTo(15.5714f, 7f)
        verticalLineTo(13.4286f)
        moveTo(15.5714f, 7f)
        horizontalLineTo(14f)
        moveTo(15.5714f, 7f)
        horizontalLineTo(17f)
        }
        }.build()

        return _notion01!!
    }

private var _notion01: ImageVector? = null
