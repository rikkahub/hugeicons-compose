package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = ImageVector.Builder(
            name = "Diamond",
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
        moveTo(5.92089f, 5.92089f)
        curveTo(8.15836f, 3.68342f, 9.2771f, 2.56468f, 10.5857f, 2.19562f)
        curveTo(11.5105f, 1.93479f, 12.4895f, 1.93479f, 13.4143f, 2.19562f)
        curveTo(14.7229f, 2.56468f, 15.8416f, 3.68342f, 18.0791f, 5.92089f)
        curveTo(20.3166f, 8.15836f, 21.4353f, 9.2771f, 21.8044f, 10.5857f)
        curveTo(22.0652f, 11.5105f, 22.0652f, 12.4895f, 21.8044f, 13.4143f)
        curveTo(21.4353f, 14.7229f, 20.3166f, 15.8416f, 18.0791f, 18.0791f)
        curveTo(15.8416f, 20.3166f, 14.7229f, 21.4353f, 13.4143f, 21.8044f)
        curveTo(12.4895f, 22.0652f, 11.5105f, 22.0652f, 10.5857f, 21.8044f)
        curveTo(9.2771f, 21.4353f, 8.15836f, 20.3166f, 5.92089f, 18.0791f)
        curveTo(3.68342f, 15.8416f, 2.56468f, 14.7229f, 2.19562f, 13.4143f)
        curveTo(1.93479f, 12.4895f, 1.93479f, 11.5105f, 2.19562f, 10.5857f)
        curveTo(2.56468f, 9.2771f, 3.68342f, 8.15836f, 5.92089f, 5.92089f)
        }
        }.build()

        return _diamond!!
    }

private var _diamond: ImageVector? = null
