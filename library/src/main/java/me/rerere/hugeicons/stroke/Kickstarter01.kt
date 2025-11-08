package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kickstarter01: ImageVector
    get() {
        if (_kickstarter01 != null) {
            return _kickstarter01!!
        }
        _kickstarter01 = ImageVector.Builder(
            name = "Kickstarter01",
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
        moveTo(4f, 5.7f)
        verticalLineTo(18.3f)
        curveTo(4f, 19.7912f, 5.3432f, 21f, 7.00012f, 21f)
        curveTo(8.65705f, 21f, 10.0002f, 19.7912f, 10.0002f, 18.3f)
        lineTo(10.0008f, 14.0117f)
        lineTo(14.5421f, 19.8484f)
        curveTo(15.4924f, 21.0699f, 17.3631f, 21.3668f, 18.7204f, 20.5115f)
        curveTo(20.0777f, 19.6562f, 20.4075f, 17.9726f, 19.4572f, 16.7511f)
        lineTo(15.7606f, 12f)
        lineTo(19.4572f, 7.24889f)
        curveTo(20.4075f, 6.02739f, 20.0777f, 4.34382f, 18.7204f, 3.48852f)
        curveTo(17.3631f, 2.63322f, 15.4924f, 2.93008f, 14.5421f, 4.15157f)
        lineTo(10.0008f, 9.98832f)
        lineTo(10.0002f, 5.7f)
        curveTo(10.0002f, 4.20883f, 8.65705f, 3f, 7.00012f, 3f)
        curveTo(5.3432f, 3f, 4f, 4.20883f, 4f, 5.7f)
        }
        }.build()

        return _kickstarter01!!
    }

private var _kickstarter01: ImageVector? = null
